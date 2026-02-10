package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mobile: ImageVector? = null

val Icons.Tr.Mobile: ImageVector
    get() = _Mobile ?: UXIcon(name = "Mobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 0f)
                horizontalLineToRelative(-6.99f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6.99f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(20f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.99f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(5.01f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.99f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(16f, 15.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(14f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(9.53f, 13f)
                curveToRelative(0.23f, 0f, 0.43f, -0.15f, 0.48f, -0.37f)
                lineToRelative(0.43f, -1.63f)
                horizontalLineToRelative(3.18f)
                lineToRelative(0.4f, 1.62f)
                curveToRelative(0.06f, 0.22f, 0.26f, 0.38f, 0.48f, 0.38f)
                curveToRelative(0.33f, 0f, 0.56f, -0.3f, 0.48f, -0.62f)
                lineToRelative(-1.56f, -6.28f)
                curveToRelative(-0.1f, -0.45f, -0.41f, -0.82f, -0.81f, -0.98f)
                curveToRelative(-0.39f, -0.16f, -0.82f, -0.15f, -1.19f, 0.04f)
                curveToRelative(-0.37f, 0.19f, -0.63f, 0.53f, -0.72f, 0.91f)
                lineToRelative(-1.66f, 6.31f)
                curveToRelative(-0.08f, 0.32f, 0.16f, 0.63f, 0.48f, 0.63f)
                close()
                moveTo(11.68f, 6.3f)
                curveToRelative(0.03f, -0.11f, 0.1f, -0.21f, 0.21f, -0.26f)
                curveToRelative(0.11f, -0.06f, 0.23f, -0.06f, 0.35f, -0.01f)
                curveToRelative(0.11f, 0.05f, 0.19f, 0.15f, 0.23f, 0.3f)
                lineToRelative(0.91f, 3.67f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(0.97f, -3.69f)
                close()
            }
        }.also { _Mobile = it}
