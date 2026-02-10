package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookQuran: ImageVector? = null

val Icons.Bs.BookQuran: ImageVector
    get() = _BookQuran ?: UXIcon(name = "BookQuran") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(3.5f, 0f)
                curveTo(2.12f, 0f, 1f, 1.12f, 1f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(18f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(23f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(19f, 3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12.14f)
                curveToRelative(-0.32f, -0.08f, -0.65f, -0.14f, -1f, -0.14f)
                lineTo(4f, 16f)
                lineTo(4f, 3f)
                horizontalLineToRelative(15f)
                close()
                moveTo(19f, 21f)
                lineTo(4f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(7f, 9.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.53f, 0f, 1.04f, 0.1f, 1.51f, 0.27f)
                curveToRelative(-1.75f, 0.62f, -3.01f, 2.27f, -3.01f, 4.23f)
                reflectiveCurveToRelative(1.26f, 3.61f, 3.01f, 4.23f)
                curveToRelative(-0.47f, 0.17f, -0.98f, 0.27f, -1.51f, 0.27f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                close()
                moveTo(11.97f, 9f)
                horizontalLineToRelative(1.81f)
                lineToRelative(0.49f, -1.88f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.49f, 1.88f)
                horizontalLineToRelative(1.8f)
                verticalLineToRelative(0.38f)
                lineToRelative(-1.38f, 0.8f)
                lineToRelative(0.55f, 1.68f)
                lineToRelative(-0.31f, 0.22f)
                lineToRelative(-1.36f, -1.05f)
                lineToRelative(-1.36f, 1.05f)
                lineToRelative(-0.3f, -0.23f)
                lineToRelative(0.54f, -1.7f)
                lineToRelative(-1.38f, -0.77f)
                verticalLineToRelative(-0.38f)
                close()
            }
        }.also { _BookQuran = it}
