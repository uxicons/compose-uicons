package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resources: ImageVector? = null

val Icons.Rs.Resources: ImageVector
    get() = _Resources ?: UXIcon(name = "Resources") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(13f, 3f)
                lineTo(13f, 7.74f)
                lineTo(10.33f, 3.11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.46f, 0f)
                lineTo(0f, 15f)
                lineTo(7.29f, 15f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.02f, -1f)
                lineTo(24f, 14f)
                close()
                moveTo(3.46f, 13f)
                lineTo(8.6f, 4.11f)
                lineToRelative(3.55f, 6.15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.26f, 13f)
                close()
                moveTo(14f, 22f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, -5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 22f)
                close()
                moveTo(22f, 12f)
                lineTo(18.89f, 12f)
                arcTo(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10.08f)
                lineTo(15f, 5f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _Resources = it}
