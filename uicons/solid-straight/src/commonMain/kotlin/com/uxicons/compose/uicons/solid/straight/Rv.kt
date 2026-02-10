package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rv: ImageVector? = null

val Icons.Ss.Rv: ImageVector
    get() = _Rv ?: UXIcon(name = "Rv") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.06f, 21f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(20.94f, 21f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(4.72f)
                lineToRelative(2.62f, 4.58f)
                curveToRelative(0.08f, 0.14f, 0.14f, 0.28f, 0.2f, 0.42f)
                lineTo(15f, 12f)
                lineTo(15f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 7f)
                close()
                moveTo(4f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 9f)
                lineTo(4f, 9f)
                close()
                moveTo(24f, 14f)
                curveToRelative(0f, 0.02f, 0f, 0.04f, 0f, 0.06f)
                lineTo(24f, 19f)
                lineTo(15f, 19f)
                lineTo(15f, 14f)
                close()
                moveTo(13f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(4f, 1f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 15.41f)
                lineTo(3.59f, 19f)
                lineTo(13f, 19f)
                close()
                moveTo(2f, 11f)
                lineTo(2f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Rv = it}
