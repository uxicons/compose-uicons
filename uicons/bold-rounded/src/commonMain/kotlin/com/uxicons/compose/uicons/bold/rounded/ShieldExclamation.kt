package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldExclamation: ImageVector? = null

val Icons.Br.ShieldExclamation: ImageVector
    get() = _ShieldExclamation ?: UXIcon(name = "ShieldExclamation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 24f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -0.16f)
            lineToRelative(-0.38f, -0.19f)
            curveToRelative(-2.1f, -1.05f, -8.95f, -4.98f, -8.95f, -11.5f)
            verticalLineToRelative(-5.1f)
            arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.62f, -5.01f)
            lineToRelative(5.91f, -1.97f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.94f, 0f)
            lineToRelative(5.91f, 1.96f)
            arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.62f, 5.01f)
            verticalLineToRelative(5.1f)
            curveToRelative(0f, 7.37f, -6.92f, 10.73f, -9.04f, 11.58f)
            lineToRelative(-0.39f, 0.16f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, 0.11f)
            close()
            moveTo(12f, 3.08f)
            lineTo(6.56f, 4.88f)
            arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.56f, 2.17f)
            verticalLineToRelative(5.1f)
            curveToRelative(0f, 4.61f, 5.14f, 7.71f, 7.07f, 8.7f)
            curveToRelative(1.9f, -0.81f, 6.93f, -3.44f, 6.93f, -8.7f)
            verticalLineToRelative(-5.1f)
            arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.56f, -2.16f)
            close()
            moveTo(13.5f, 12.5f)
            verticalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
            moveTo(12f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            close()
        }
    }.also { _ShieldExclamation = it }
