package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SplitScreen: ImageVector? = null

val Icons.Ss.SplitScreen: ImageVector
    get() = _SplitScreen ?: UXIcon(name = "SplitScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.58f)
                lineToRelative(-0.57f, 0.59f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.5f, -2.62f)
                horizontalLineToRelative(1.51f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -1.14f, 0.89f, -1.94f, 1.67f, -2.65f)
                curveToRelative(0.69f, -0.62f, 1.33f, -1.22f, 1.33f, -1.84f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.51f, -1.1f, 2.52f, -1.99f, 3.32f)
                curveToRelative(-0.06f, 0.06f, -0.12f, 0.11f, -0.19f, 0.18f)
                horizontalLineToRelative(2.18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SplitScreen = it}
