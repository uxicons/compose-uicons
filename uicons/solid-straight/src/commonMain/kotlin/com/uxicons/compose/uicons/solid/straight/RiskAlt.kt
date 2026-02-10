package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RiskAlt: ImageVector? = null

val Icons.Ss.RiskAlt: ImageVector
    get() = _RiskAlt ?: UXIcon(name = "RiskAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(9f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.97f, 22.56f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-6.23f, -6.23f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveTo(4.49f, 20f, 0f, 15.51f, 0f, 10f)
                reflectiveCurveTo(4.49f, 0f, 10f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(6.23f, 6.23f)
                close()
                moveTo(16f, 14f)
                lineTo(10f, 3.71f)
                lineToRelative(-6f, 10.29f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _RiskAlt = it}
