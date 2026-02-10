package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeControlApp: ImageVector? = null

val Icons.Rs.HomeControlApp: ImageVector
    get() = _HomeControlApp ?: UXIcon(name = "HomeControlApp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 16f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(6f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(24f, 10f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                verticalLineToRelative(-2f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(20f, 10f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(16f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(8.82f, 5.28f)
                curveToRelative(-0.24f, -0.19f, -0.53f, -0.28f, -0.82f, -0.28f)
                reflectiveCurveToRelative(-0.58f, 0.09f, -0.82f, 0.28f)
                lineToRelative(-2.67f, 2.09f)
                curveToRelative(-0.32f, 0.25f, -0.51f, 0.64f, -0.51f, 1.05f)
                verticalLineToRelative(4.58f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.58f)
                curveToRelative(0f, -0.41f, -0.19f, -0.8f, -0.51f, -1.05f)
                lineToRelative(-2.67f, -2.09f)
                close()
                moveTo(9f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _HomeControlApp = it}
