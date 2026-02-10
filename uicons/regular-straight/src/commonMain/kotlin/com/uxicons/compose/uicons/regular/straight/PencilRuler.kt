package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilRuler: ImageVector? = null

val Icons.Rs.PencilRuler: ImageVector
    get() = _PencilRuler ?: UXIcon(name = "PencilRuler") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 18.97f)
                lineToRelative(-4.15f, 4.15f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-3.46f, -3.51f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(3.46f, 3.5f)
                curveToRelative(0.37f, 0.37f, 1.03f, 0.38f, 1.41f, -0.0f)
                lineToRelative(2.75f, -2.75f)
                lineToRelative(-2.67f, -2.71f)
                lineToRelative(-1.98f, 1.94f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(3.4f, -3.33f)
                lineToRelative(5.46f, 5.55f)
                close()
                moveTo(4.39f, 11.86f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(-3.5f, -3.46f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.75f, -2.75f)
                lineToRelative(2.71f, 2.67f)
                lineToRelative(-1.94f, 1.98f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(3.33f, -3.4f)
                lineTo(5.03f, 0.0f)
                lineTo(0.88f, 4.15f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0.01f, 4.25f)
                lineToRelative(3.5f, 3.46f)
                close()
                moveTo(22.93f, 6.27f)
                lineTo(5.19f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.19f)
                lineTo(17.73f, 1.07f)
                curveToRelative(1.43f, -1.43f, 3.76f, -1.43f, 5.19f, 0f)
                curveToRelative(1.43f, 1.43f, 1.43f, 3.76f, 0f, 5.19f)
                close()
                moveTo(17.73f, 8.64f)
                lineToRelative(-2.37f, -2.37f)
                lineTo(2f, 19.64f)
                verticalLineToRelative(2.37f)
                horizontalLineToRelative(2.37f)
                lineToRelative(13.36f, -13.36f)
                close()
                moveTo(21.51f, 2.49f)
                curveToRelative(-0.65f, -0.65f, -1.71f, -0.65f, -2.37f, 0f)
                lineToRelative(-2.37f, 2.37f)
                lineToRelative(2.37f, 2.37f)
                lineToRelative(2.37f, -2.37f)
                curveToRelative(0.65f, -0.65f, 0.65f, -1.71f, 0f, -2.37f)
                close()
            }
        }.also { _PencilRuler = it}
