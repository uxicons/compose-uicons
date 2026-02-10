package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CediSign: ImageVector? = null

val Icons.Tr.CediSign: ImageVector
    get() = _CediSign ?: UXIcon(name = "CediSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.75f, 16.85f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.03f, -0.67f, 0.21f)
                curveToRelative(-1.26f, 2.43f, -3.73f, 3.94f, -6.46f, 3.94f)
                horizontalLineToRelative(-0.61f)
                lineTo(13.01f, 3f)
                horizontalLineToRelative(0.61f)
                curveToRelative(2.78f, 0f, 5.28f, 1.55f, 6.52f, 4.04f)
                curveToRelative(0.12f, 0.25f, 0.42f, 0.35f, 0.67f, 0.23f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.23f, -0.67f)
                curveToRelative(-1.41f, -2.83f, -4.25f, -4.6f, -7.41f, -4.6f)
                horizontalLineToRelative(-0.61f)
                lineTo(13.02f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-0.5f)
                curveTo(6.81f, 2f, 3f, 5.81f, 3f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(0.61f)
                curveToRelative(3.11f, 0f, 5.93f, -1.72f, 7.35f, -4.48f)
                curveToRelative(0.13f, -0.25f, 0.03f, -0.55f, -0.21f, -0.67f)
                close()
                moveTo(11.5f, 21f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(0.5f)
                lineTo(12f, 21f)
                horizontalLineToRelative(-0.5f)
                close()
            }
        }.also { _CediSign = it}
