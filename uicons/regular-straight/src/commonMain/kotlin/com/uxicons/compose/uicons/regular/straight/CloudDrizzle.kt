package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDrizzle: ImageVector? = null

val Icons.Rs.CloudDrizzle: ImageVector
    get() = _CloudDrizzle ?: UXIcon(name = "CloudDrizzle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(11f, 24f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(2f)
                lineTo(10f, 15f)
                lineTo(8f, 15f)
                close()
                moveTo(5f, 24f)
                lineTo(7f, 24f)
                lineTo(7f, 21f)
                lineTo(5f, 21f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(2f)
                lineTo(16f, 15f)
                lineTo(14f, 15f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(2f)
                lineTo(19f, 21f)
                lineTo(17f, 21f)
                close()
                moveTo(17.44f, 5.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, 10.05f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19.79f)
                verticalLineToRelative(-2.13f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, -6.28f)
                lineToRelative(0.8f, -0.41f)
                lineToRelative(-0.32f, -0.84f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 4.29f)
                lineToRelative(0.21f, 0.69f)
                lineTo(16.68f, 7f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 16.74f)
                verticalLineToRelative(2.39f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.44f, 5.06f)
                close()
            }
        }.also { _CloudDrizzle = it}
