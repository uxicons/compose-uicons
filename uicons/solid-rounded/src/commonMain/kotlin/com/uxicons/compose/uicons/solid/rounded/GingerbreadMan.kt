package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GingerbreadMan: ImageVector? = null

val Icons.Sr.GingerbreadMan: ImageVector
    get() = _GingerbreadMan ?: UXIcon(name = "GingerbreadMan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 7.28f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, -1.13f)
                lineToRelative(-2.85f, 0.89f)
                arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.48f, -0.69f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.5f, 0f)
                arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.48f, 0.69f)
                lineTo(5.42f, 6.15f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.73f, 4.69f)
                lineToRelative(1.6f, 0.66f)
                curveToRelative(2.11f, 0.74f, 2.02f, 3.56f, 1.02f, 5.17f)
                lineTo(4.43f, 20.06f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.15f, 2.79f)
                lineTo(11.43f, 18.3f)
                arcToRelative(0.69f, 0.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.14f, 0f)
                lineToRelative(2.86f, 4.55f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.15f, -2.79f)
                lineTo(17.7f, 16.68f)
                curveToRelative(-1f, -1.61f, -1.08f, -4.43f, 1.02f, -5.17f)
                lineToRelative(1.6f, -0.66f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.7f, 7.28f)
                close()
                moveTo(12f, 16f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(12f, 12f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
            }
        }.also { _GingerbreadMan = it}
