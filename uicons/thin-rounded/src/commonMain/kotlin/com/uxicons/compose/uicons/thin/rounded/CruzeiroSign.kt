package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CruzeiroSign: ImageVector? = null

val Icons.Tr.CruzeiroSign: ImageVector
    get() = _CruzeiroSign ?: UXIcon(name = "CruzeiroSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.76f, 18.63f)
                curveToRelative(-1.71f, 3.31f, -5.09f, 5.37f, -8.81f, 5.37f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-5.46f, 0f, -9.91f, -4.45f, -9.91f, -9.91f)
                verticalLineToRelative(-4.18f)
                curveTo(2f, 4.45f, 6.45f, 0f, 11.91f, 0f)
                horizontalLineToRelative(1.05f)
                curveToRelative(3.79f, 0f, 7.19f, 2.11f, 8.88f, 5.5f)
                curveToRelative(0.12f, 0.25f, 0.02f, 0.55f, -0.23f, 0.67f)
                curveToRelative(-0.25f, 0.13f, -0.55f, 0.02f, -0.67f, -0.22f)
                curveToRelative(-1.52f, -3.05f, -4.58f, -4.95f, -7.98f, -4.95f)
                horizontalLineToRelative(-1.05f)
                curveTo(7f, 1f, 3f, 5f, 3f, 9.91f)
                verticalLineToRelative(4.18f)
                curveToRelative(0f, 4.26f, 3f, 7.83f, 7f, 8.7f)
                verticalLineTo(11.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                curveToRelative(1.03f, -1.51f, 2.77f, -2.5f, 4.73f, -2.5f)
                horizontalLineToRelative(1.77f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-2.61f, 0f, -4.73f, 2.12f, -4.73f, 4.73f)
                verticalLineToRelative(6.23f)
                curveToRelative(0.3f, 0.03f, 0.6f, 0.05f, 0.91f, 0.05f)
                horizontalLineToRelative(1.05f)
                curveToRelative(3.35f, 0f, 6.38f, -1.85f, 7.92f, -4.82f)
                curveToRelative(0.13f, -0.25f, 0.43f, -0.34f, 0.67f, -0.21f)
                curveToRelative(0.25f, 0.13f, 0.34f, 0.43f, 0.21f, 0.67f)
                close()
            }
        }.also { _CruzeiroSign = it}
