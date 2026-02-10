package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Rs.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.68f, 0.15f)
                arcToRelative(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, 0.56f)
                lineTo(-0.02f, 22.61f)
                lineToRelative(1.47f, 1.36f)
                lineToRelative(5.5f, -5.94f)
                lineToRelative(0f, 0.05f)
                curveTo(19.96f, 16.89f, 24f, 6.24f, 24f, 2.5f)
                verticalLineTo(2.15f)
                arcTo(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.68f, 0.15f)
                close()
                moveTo(22f, 2.5f)
                curveToRelative(0f, 1.88f, -2.32f, 11.14f, -12.96f, 13.25f)
                lineTo(21.69f, 2.08f)
                arcTo(0.23f, 0.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.87f, 2f)
                arcToRelative(0.19f, 0.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 0.01f)
                curveToRelative(0.03f, 0.01f, 0.06f, 0.02f, 0.06f, 0.13f)
                close()
            }
        }.also { _Knife = it}
