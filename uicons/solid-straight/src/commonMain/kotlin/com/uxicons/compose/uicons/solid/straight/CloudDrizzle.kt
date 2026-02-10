package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDrizzle: ImageVector? = null

val Icons.Ss.CloudDrizzle: ImageVector
    get() = _CloudDrizzle ?: UXIcon(name = "CloudDrizzle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                lineTo(11f, 24f)
                lineTo(11f, 21f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(3f)
                lineTo(7f, 24f)
                close()
                moveTo(24f, 12f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
                lineTo(4.78f, 19f)
                arcTo(4.79f, 4.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.3f, 10.15f)
                curveTo(-0.1f, 0.41f, 13.35f, -4.2f, 17.42f, 5.02f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(10f, 14f)
                lineTo(8f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 14f)
                lineTo(14f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 21f)
                lineTo(17f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _CloudDrizzle = it}
