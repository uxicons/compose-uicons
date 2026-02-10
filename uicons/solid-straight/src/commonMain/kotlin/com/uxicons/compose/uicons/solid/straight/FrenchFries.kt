package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FrenchFries: ImageVector? = null

val Icons.Ss.FrenchFries: ImageVector
    get() = _FrenchFries ?: UXIcon(name = "FrenchFries") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.08f, 24f)
                horizontalLineTo(4.94f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.95f, -2.46f)
                lineTo(0f, 12f)
                horizontalLineTo(24f)
                lineToRelative(-1.97f, 9.54f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.08f, 24f)
                close()
                moveTo(2.02f, 10f)
                horizontalLineToRelative(2.1f)
                lineTo(3.28f, 7.39f)
                lineToRelative(2.4f, -0.76f)
                lineTo(6.26f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4.82f)
                lineToRelative(0.57f, -3.35f)
                lineToRelative(2.33f, 0.74f)
                lineTo(19.88f, 10f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.25f, -3.91f)
                lineToRelative(-4.5f, -1.43f)
                lineTo(19.4f, 0.71f)
                lineTo(14.75f, 0f)
                lineTo(14.4f, 2f)
                horizontalLineTo(9.51f)
                lineTo(9.15f, 0f)
                lineTo(4.69f, 0.8f)
                lineToRelative(0.66f, 3.84f)
                lineTo(0.77f, 6.09f)
                close()
            }
        }.also { _FrenchFries = it}
