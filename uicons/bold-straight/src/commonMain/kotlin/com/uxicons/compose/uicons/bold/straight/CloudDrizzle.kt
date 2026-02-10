package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDrizzle: ImageVector? = null

val Icons.Bs.CloudDrizzle: ImageVector
    get() = _CloudDrizzle ?: UXIcon(name = "CloudDrizzle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                lineTo(8f, 20f)
                verticalLineToRelative(4f)
                lineTo(5f, 24f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(3f)
                lineTo(13f, 20f)
                lineTo(10f, 20f)
                close()
                moveTo(10f, 14f)
                lineTo(7f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(3f)
                lineTo(18f, 20f)
                lineTo(15f, 20f)
                close()
                moveTo(24f, 12.48f)
                lineTo(24f, 12.5f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 6.9f)
                verticalLineToRelative(-3.94f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12.5f)
                verticalLineToRelative(-0.02f)
                horizontalLineToRelative(0f)
                arcTo(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.45f, 8f)
                lineTo(15.37f, 7.96f)
                lineToRelative(-0.31f, -1.04f)
                arcTo(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.09f, 3f)
                arcTo(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8f)
                arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 2.02f)
                lineToRelative(0.48f, 1.26f)
                lineToRelative(-1.2f, 0.61f)
                arcTo(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 14.39f)
                lineTo(3f, 14.39f)
                curveToRelative(0f, 0.04f, 0f, 5.29f, 0f, 5.29f)
                arcToRelative(6.21f, 6.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -5.29f)
                verticalLineToRelative(-0.01f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, 9.89f)
                arcTo(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 8f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.09f, -8f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.49f, 5.1f)
                arcTo(7.41f, 7.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.48f)
                close()
                moveTo(0.01f, 14.39f)
                lineTo(0f, 14.39f)
                curveTo(0f, 14.4f, 0f, 14.4f, 0.01f, 14.39f)
                close()
                moveTo(16f, 14f)
                lineTo(13f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _CloudDrizzle = it}
