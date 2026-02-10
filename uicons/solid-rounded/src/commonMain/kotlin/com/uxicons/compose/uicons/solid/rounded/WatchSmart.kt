package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchSmart: ImageVector? = null

val Icons.Sr.WatchSmart: ImageVector
    get() = _WatchSmart ?: UXIcon(name = "WatchSmart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.99f, 22f)
                curveToRelative(1.07f, 0f, 2.09f, -0.25f, 3f, -0.69f)
                verticalLineToRelative(1.69f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6.99f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0.91f, 0.43f, 1.93f, 0.69f, 3f, 0.69f)
                horizontalLineToRelative(6f)
                close()
                moveTo(19.99f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(14.71f, 13.29f)
                lineToRelative(-1.71f, -1.71f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.29f, 0.71f)
                lineToRelative(2f, 2f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(14.99f, 2f)
                curveToRelative(1.07f, 0f, 2.09f, 0.25f, 3f, 0.69f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(6.99f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.69f)
                curveToRelative(0.91f, -0.43f, 1.93f, -0.69f, 3f, -0.69f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _WatchSmart = it}
