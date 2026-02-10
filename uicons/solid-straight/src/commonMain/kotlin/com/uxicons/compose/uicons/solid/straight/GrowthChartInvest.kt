package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrowthChartInvest: ImageVector? = null

val Icons.Ss.GrowthChartInvest: ImageVector
    get() = _GrowthChartInvest ?: UXIcon(name = "GrowthChartInvest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 16f)
                curveToRelative(0f, 0.38f, 0.27f, 0.7f, 0.65f, 0.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.34f, 0.22f, 2.31f, 1.37f, 2.31f, 2.73f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.38f, -0.27f, -0.7f, -0.65f, -0.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-1.34f, -0.22f, -2.31f, -1.37f, -2.31f, -2.73f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-5.09f, 5.09f)
                lineTo(9.5f, 1.09f)
                lineTo(0.12f, 10.47f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(7.97f, -7.97f)
                lineToRelative(6f, 6f)
                lineToRelative(6.5f, -6.5f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(2f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(1f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10.76f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(8.76f)
                close()
                moveTo(11f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13.76f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(15.76f)
                close()
                moveTo(6f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-15.76f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(13.76f)
                close()
            }
        }.also { _GrowthChartInvest = it}
