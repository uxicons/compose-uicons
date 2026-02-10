package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SplitScreen: ImageVector? = null

val Icons.Rs.SplitScreen: ImageVector
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
                moveTo(2f, 17f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 6.04f)
                verticalLineToRelative(7.96f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.58f)
                lineToRelative(-0.57f, 0.59f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.5f, -2.58f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.14f, 0.89f, -1.94f, 1.67f, -2.65f)
                curveToRelative(0.69f, -0.62f, 1.33f, -1.22f, 1.33f, -1.84f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(-0.01f, 1.63f, -1.22f, 2.61f, -2.18f, 3.5f)
                horizontalLineToRelative(2.18f)
                close()
            }
        }.also { _SplitScreen = it}
