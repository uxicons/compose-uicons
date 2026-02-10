package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShowers: ImageVector? = null

val Icons.Bs.CloudShowers: ImageVector
    get() = _CloudShowers ?: UXIcon(name = "CloudShowers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                lineTo(11f, 24f)
                close()
                moveTo(16f, 22f)
                horizontalLineToRelative(3f)
                lineTo(19f, 15f)
                lineTo(16f, 15f)
                close()
                moveTo(6f, 22f)
                lineTo(9f, 22f)
                lineTo(9f, 15f)
                lineTo(6f, 15f)
                close()
                moveTo(24f, 12.5f)
                horizontalLineToRelative(0f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 6.23f)
                reflectiveCurveToRelative(0f, -6.23f, 0f, -6.23f)
                horizontalLineToRelative(0f)
                arcTo(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.45f, 8f)
                lineTo(15.37f, 7.96f)
                lineToRelative(-0.31f, -1.04f)
                arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.97f, -3.9f)
                arcTo(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8.03f)
                arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 2.02f)
                lineToRelative(0.48f, 1.26f)
                lineToRelative(-1.2f, 0.61f)
                arcTo(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 14.41f)
                arcToRelative(3.21f, 3.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2.33f)
                verticalLineToRelative(3.42f)
                arcToRelative(6.17f, 6.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -5.75f)
                lineTo(0f, 14.4f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, 9.92f)
                arcTo(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 8.03f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.09f, -8f)
                arcTo(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.59f, 5.1f)
                arcTo(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.5f)
                close()
                moveTo(0.01f, 14.41f)
                lineTo(0f, 14.41f)
                curveTo(0f, 14.42f, 0f, 14.43f, 0.01f, 14.41f)
                close()
                moveTo(3.0f, 14.41f)
                lineTo(3f, 14.41f)
                curveTo(3f, 14.43f, 3f, 14.42f, 3f, 14.41f)
                close()
                moveTo(24.0f, 12.51f)
                verticalLineToRelative(0f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _CloudShowers = it}
