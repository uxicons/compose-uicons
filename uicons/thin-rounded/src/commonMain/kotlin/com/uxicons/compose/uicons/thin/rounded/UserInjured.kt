package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Tr.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -3.5f, -2.93f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.5f, -6f, 6f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(16.9f, 5f)
                horizontalLineToRelative(-5.86f)
                lineToRelative(4.04f, -2.94f)
                curveToRelative(0.92f, 0.72f, 1.58f, 1.75f, 1.82f, 2.94f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.77f, 0f, 1.51f, 0.18f, 2.16f, 0.49f)
                lineToRelative(-4.82f, 3.51f)
                horizontalLineToRelative(-2.24f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-2.19f, -7.88f)
                curveToRelative(0.42f, -0.08f, 0.86f, -0.12f, 1.31f, -0.12f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                close()
                moveTo(11.84f, 23f)
                horizontalLineToRelative(-5.84f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.06f, 1.98f, -5.67f, 4.73f, -6.62f)
                lineToRelative(2.12f, 7.62f)
                close()
            }
        }.also { _UserInjured = it}
