package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Tr.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.97f, 17.52f)
                curveToRelative(-1.43f, 2.76f, -4.25f, 4.48f, -7.35f, 4.48f)
                horizontalLineToRelative(-0.61f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-4.69f, 0f, -8.5f, -3.81f, -8.5f, -8.5f)
                verticalLineToRelative(-3f)
                curveTo(3f, 5.81f, 6.81f, 2f, 11.5f, 2f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(0.61f)
                curveToRelative(3.16f, 0f, 6f, 1.76f, 7.41f, 4.6f)
                curveToRelative(0.12f, 0.25f, 0.02f, 0.55f, -0.23f, 0.67f)
                curveToRelative(-0.25f, 0.12f, -0.55f, 0.02f, -0.67f, -0.23f)
                curveToRelative(-1.24f, -2.49f, -3.74f, -4.04f, -6.52f, -4.04f)
                horizontalLineToRelative(-2.11f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(2.11f)
                curveToRelative(2.73f, 0f, 5.21f, -1.51f, 6.46f, -3.94f)
                curveToRelative(0.13f, -0.25f, 0.43f, -0.34f, 0.67f, -0.21f)
                reflectiveCurveToRelative(0.34f, 0.43f, 0.21f, 0.67f)
                close()
            }
        }.also { _CentSign = it}
