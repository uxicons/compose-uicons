package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Bs.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 14.15f)
                arcToRelative(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.15f, -3.82f)
                arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.02f, -1.2f)
                horizontalLineToRelative(-3f)
                arcToRelative(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.14f, -4.29f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.1f, 12.96f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 1.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.56f, 15.99f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Interrogation = it}
