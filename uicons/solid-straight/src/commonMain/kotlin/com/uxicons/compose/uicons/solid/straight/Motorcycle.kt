package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Motorcycle: ImageVector? = null

val Icons.Ss.Motorcycle: ImageVector
    get() = _Motorcycle ?: UXIcon(name = "Motorcycle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                curveToRelative(-5.07f, 0.03f, -6.87f, -6.87f, -2.49f, -9.31f)
                lineToRelative(1.55f, 4.62f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.87f, -0.63f)
                lineToRelative(-1.53f, -4.63f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(18.41f, 11.06f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 0.63f)
                lineToRelative(-0.56f, -1.68f)
                arcToRelative(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.79f)
                lineToRelative(-3.75f, 5f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.48f, 1.04f)
                curveTo(8.82f, 22.79f, 0.11f, 22.09f, 0f, 16f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.34f, -4.79f)
                lineTo(6.8f, 10.6f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                lineTo(2f, 9f)
                lineTo(2f, 7f)
                lineTo(6f, 7f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.82f, 9f)
                horizontalLineToRelative(5.27f)
                arcToRelative(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.2f, -0.96f)
                lineTo(14.28f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 3f)
                horizontalLineToRelative(4.72f)
                lineToRelative(1.44f, 4.31f)
                curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.08f, -0.02f)
                arcToRelative(17.0f, 17.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, -0.26f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                lineTo(21f, 10f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.71f, -0.97f)
                curveToRelative(-0.48f, 0.04f, -1f, 0.1f, -1.5f, 0.19f)
                close()
                moveTo(12.5f, 11f)
                lineTo(8.82f, 11f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.43f, 0.8f)
                lineTo(6f, 15f)
                lineTo(9f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -0.4f)
                close()
            }
        }.also { _Motorcycle = it}
