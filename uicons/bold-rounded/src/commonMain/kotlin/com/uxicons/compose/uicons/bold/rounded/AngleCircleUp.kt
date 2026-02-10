package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleUp: ImageVector? = null

val Icons.Br.AngleCircleUp: ImageVector
    get() = _AngleCircleUp ?: UXIcon(name = "AngleCircleUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, -9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 7.99f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.45f, 0.99f)
            lineToRelative(3.1f, 3.05f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.1f, 2.14f)
            lineToRelative(-3.1f, -3.04f)
            arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.7f, 0f)
            lineToRelative(-3.1f, 3.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.1f, -2.14f)
            lineToRelative(3.1f, -3.05f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.99f)
            close()
        }
    }.also { _AngleCircleUp = it }
