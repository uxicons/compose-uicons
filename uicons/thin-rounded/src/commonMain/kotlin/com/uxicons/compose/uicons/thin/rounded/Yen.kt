package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yen: ImageVector? = null

val Icons.Tr.Yen: ImageVector
    get() = _Yen ?: UXIcon(name = "Yen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.8f, 0.1f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.12f, -0.7f, 0.09f)
                lineToRelative(-11.1f, 14.48f)
                lineTo(0.9f, 0.2f)
                curveTo(0.73f, -0.02f, 0.42f, -0.06f, 0.2f, 0.1f)
                curveTo(-0.02f, 0.27f, -0.07f, 0.58f, 0.1f, 0.8f)
                lineToRelative(10.88f, 14.2f)
                horizontalLineToRelative(-5.49f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.49f)
                lineTo(23.9f, 0.8f)
                curveToRelative(0.17f, -0.22f, 0.13f, -0.53f, -0.09f, -0.7f)
                close()
            }
        }.also { _Yen = it}
