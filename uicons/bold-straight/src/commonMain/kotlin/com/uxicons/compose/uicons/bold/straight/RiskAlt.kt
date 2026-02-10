package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RiskAlt: ImageVector? = null

val Icons.Bs.RiskAlt: ImageVector
    get() = _RiskAlt ?: UXIcon(name = "RiskAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.06f, 21.94f)
                lineToRelative(-6.02f, -6.02f)
                curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
                lineToRelative(6.02f, 6.02f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(10f, 3f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.4f, -0.42f, 2.7f, -1.12f, 3.79f)
                lineTo(10f, 3.71f)
                lineToRelative(-5.88f, 10.07f)
                curveToRelative(-0.71f, -1.09f, -1.12f, -2.39f, -1.12f, -3.79f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                close()
                moveTo(9f, 10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4.26f, 14f)
                horizontalLineToRelative(11.47f)
                curveToRelative(-1.27f, 1.81f, -3.36f, 3f, -5.74f, 3f)
                reflectiveCurveToRelative(-4.47f, -1.19f, -5.74f, -3f)
                close()
            }
        }.also { _RiskAlt = it}
