package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fog: ImageVector? = null

val Icons.Rs.Fog: ImageVector
    get() = _Fog ?: UXIcon(name = "Fog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                lineTo(5f, 24f)
                lineTo(5f, 22f)
                horizontalLineToRelative(9f)
                close()
                moveTo(19f, 22f)
                lineTo(16f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 18f)
                lineTo(10f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                close()
                moveTo(8f, 18f)
                lineTo(5f, 18f)
                verticalLineToRelative(2f)
                lineTo(8f, 20f)
                close()
                moveTo(14f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                close()
                moveTo(19f, 14f)
                lineTo(16f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(17.44f, 5.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, 10.05f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, 9.37f)
                lineTo(3.04f, 16.98f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.87f, -5.6f)
                lineToRelative(0.8f, -0.41f)
                lineToRelative(-0.32f, -0.84f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 4.29f)
                lineToRelative(0.21f, 0.69f)
                lineTo(16.68f, 7f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 15.66f)
                lineTo(21f, 18.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.44f, 5.06f)
                close()
            }
        }.also { _Fog = it}
