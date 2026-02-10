package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pan: ImageVector? = null

val Icons.Rs.Pan: ImageVector
    get() = _Pan ?: UXIcon(name = "Pan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, -0.01f)
                arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.14f, 14.6f)
                lineTo(-0.01f, 19.75f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(5.15f, -5.15f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, -0.01f)
                close()
                moveTo(4.23f, 21.17f)
                lineTo(2.82f, 19.75f)
                lineToRelative(3.45f, -3.45f)
                arcToRelative(10.11f, 10.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                close()
                moveTo(14f, 17.98f)
                arcToRelative(8.0f, 8.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.99f, -7.99f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17.98f)
                close()
                moveTo(20f, 9.98f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, -6f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                close()
            }
        }.also { _Pan = it}
