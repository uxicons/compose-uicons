package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAlt: ImageVector? = null

val Icons.Bs.BookAlt: ImageVector
    get() = _BookAlt ?: UXIcon(name = "BookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.77f, 1.75f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.79f, -0.74f)
                lineToRelative(-5.9f, 1.07f)
                arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.08f, 1f)
                arcToRelative(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.08f, -1f)
                lineToRelative(-5.89f, -1.07f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.02f, 3.35f)
                verticalLineToRelative(16.52f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                verticalLineToRelative(-16.52f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.23f, -2.62f)
                close()
                moveTo(10.5f, 19.75f)
                lineTo(3f, 18.38f)
                verticalLineToRelative(-14.02f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, -0.4f)
                lineToRelative(5.9f, 1.07f)
                arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.12f, 1.34f)
                close()
                moveTo(21f, 18.38f)
                lineTo(13.5f, 19.75f)
                verticalLineToRelative(-13.37f)
                arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.12f, -1.34f)
                lineToRelative(5.9f, -1.07f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, 0.4f)
                close()
            }
        }.also { _BookAlt = it}
