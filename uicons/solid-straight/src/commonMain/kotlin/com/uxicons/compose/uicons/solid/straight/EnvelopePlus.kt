package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopePlus: ImageVector? = null

val Icons.Ss.EnvelopePlus: ImageVector
    get() = _EnvelopePlus ?: UXIcon(name = "EnvelopePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                lineTo(24f, 6f)
                lineTo(20f, 6f)
                verticalLineToRelative(4f)
                lineTo(18f, 10f)
                lineTo(18f, 6f)
                lineTo(14f, 6f)
                lineTo(14f, 4f)
                horizontalLineToRelative(4f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                lineTo(20f, 4f)
                close()
                moveTo(12f, 15.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineTo(16.97f, 11.7f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.29f, 3f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 4.89f)
                lineToRelative(9.66f, 9.66f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.42f)
                close()
                moveTo(15.54f, 15.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0f, 7.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 9.89f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.48f, 2.08f)
                close()
            }
        }.also { _EnvelopePlus = it}
