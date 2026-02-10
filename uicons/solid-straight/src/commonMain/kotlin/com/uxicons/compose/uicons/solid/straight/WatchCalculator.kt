package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchCalculator: ImageVector? = null

val Icons.Ss.WatchCalculator: ImageVector
    get() = _WatchCalculator ?: UXIcon(name = "WatchCalculator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 22f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.1f)
                verticalLineToRelative(2.1f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.1f, 1f, 0.1f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 2f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.1f)
                lineTo(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(2.1f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.1f, 1f, -0.1f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 4f)
                lineTo(7f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(20f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 9f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _WatchCalculator = it}
