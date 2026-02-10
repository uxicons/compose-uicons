package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinSquint: ImageVector? = null

val Icons.Sr.GrinSquint: ImageVector
    get() = _GrinSquint ?: UXIcon(name = "GrinSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(13.45f, 8.17f)
                lineTo(16.45f, 6.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 1.66f)
                lineTo(15.8f, 9f)
                lineToRelative(1.75f, 1.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.11f, 1.66f)
                lineToRelative(-3f, -2f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.45f, 8.17f)
                close()
                moveTo(6.45f, 7.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.11f, -1.66f)
                lineToRelative(3f, 2f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.66f)
                lineToRelative(-3f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.11f, -1.66f)
                lineTo(8.2f, 9f)
                close()
                moveTo(17.84f, 15.54f)
                arcTo(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, -3.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.98f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, 15.54f)
                close()
            }
        }.also { _GrinSquint = it}
