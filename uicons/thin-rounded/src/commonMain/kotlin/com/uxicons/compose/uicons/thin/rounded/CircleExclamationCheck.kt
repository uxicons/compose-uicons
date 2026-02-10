package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Tr.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 14f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(18.61f, 16.06f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.04f, -0.68f, 0.2f)
                curveToRelative(-1.57f, 2.92f, -4.61f, 4.74f, -7.93f, 4.74f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(5.04f, 3f, 10f, 3f)
                curveToRelative(4.05f, 0f, 7.62f, 2.73f, 8.69f, 6.63f)
                curveToRelative(0.06f, 0.22f, 0.26f, 0.37f, 0.48f, 0.37f)
                curveToRelative(0.04f, 0f, 0.09f, -0.01f, 0.13f, -0.02f)
                curveToRelative(0.27f, -0.07f, 0.42f, -0.35f, 0.35f, -0.61f)
                curveToRelative(-1.18f, -4.34f, -5.15f, -7.37f, -9.65f, -7.37f)
                curveTo(4.49f, 2f, 0f, 6.49f, 0f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                horizontalLineToRelative(0.03f)
                curveToRelative(3.67f, -0.01f, 7.03f, -2.02f, 8.78f, -5.26f)
                curveToRelative(0.13f, -0.24f, 0.04f, -0.55f, -0.2f, -0.68f)
                close()
                moveTo(23.86f, 8.65f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineToRelative(-4.0f, 3.88f)
                curveToRelative(-0.64f, 0.64f, -1.67f, 0.64f, -2.32f, -0.01f)
                lineToRelative(-1.99f, -1.88f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.02f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.02f, 0.71f)
                lineToRelative(1.98f, 1.86f)
                curveToRelative(0.51f, 0.51f, 1.19f, 0.77f, 1.86f, 0.77f)
                reflectiveCurveToRelative(1.34f, -0.26f, 1.85f, -0.77f)
                lineToRelative(3.99f, -3.88f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                close()
            }
        }.also { _CircleExclamationCheck = it}
