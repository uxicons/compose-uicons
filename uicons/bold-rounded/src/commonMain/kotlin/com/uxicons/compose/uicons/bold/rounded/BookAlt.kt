package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAlt: ImageVector? = null

val Icons.Br.BookAlt: ImageVector
    get() = _BookAlt ?: UXIcon(name = "BookAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.02f, 2.28f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.48f, 1.1f)
            lineToRelative(-3.28f, 0.69f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.85f)
            arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.85f, 1.79f)
            lineToRelative(-3.36f, -0.7f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
            verticalLineToRelative(9.79f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.49f, 21.7f)
            lineTo(10.3f, 22.85f)
            arcTo(9.43f, 9.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.99f, 23f)
            arcToRelative(9.66f, 9.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, -0.16f)
            lineTo(19.48f, 21.7f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.29f)
            verticalLineTo(6.5f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.02f, 2.28f)
            close()
            moveTo(10.5f, 19.83f)
            lineTo(5.05f, 18.75f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.29f)
            verticalLineTo(6.5f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.49f, 4f)
            arcToRelative(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, 0.04f)
            lineToRelative(3.36f, 0.7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 6.21f)
            close()
            moveTo(21f, 16.29f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, 2.46f)
            lineTo(13.5f, 19.83f)
            verticalLineTo(6.21f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.27f, -1.48f)
            lineToRelative(3.28f, -0.69f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.5f)
            close()
        }
    }.also { _BookAlt = it }
