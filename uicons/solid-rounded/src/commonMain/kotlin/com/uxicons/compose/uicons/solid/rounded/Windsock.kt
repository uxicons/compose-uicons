package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windsock: ImageVector? = null

val Icons.Sr.Windsock: ImageVector
    get() = _Windsock ?: UXIcon(name = "Windsock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 4.29f)
                lineToRelative(3f, 0.57f)
                lineTo(9f, 17.22f)
                lineToRelative(-3f, 0.57f)
                close()
                moveTo(14f, 5.82f)
                lineTo(11f, 5.25f)
                lineTo(11f, 16.84f)
                lineToRelative(3f, -0.57f)
                close()
                moveTo(19f, 6.77f)
                lineTo(16f, 6.2f)
                verticalLineToRelative(9.69f)
                lineToRelative(3f, -0.57f)
                close()
                moveTo(4f, 3.91f)
                lineToRelative(-1f, -0.19f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, 0.04f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3.72f)
                lineTo(1f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(3f, 18.36f)
                lineToRelative(1f, -0.19f)
                close()
                moveTo(21f, 7.15f)
                verticalLineToRelative(7.78f)
                arcToRelative(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3.05f)
                lineTo(24f, 10.21f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7.15f)
                close()
            }
        }.also { _Windsock = it}
