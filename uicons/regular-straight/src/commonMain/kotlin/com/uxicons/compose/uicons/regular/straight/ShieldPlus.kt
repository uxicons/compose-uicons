package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldPlus: ImageVector? = null

val Icons.Rs.ShieldPlus: ImageVector
    get() = _ShieldPlus ?: UXIcon(name = "ShieldPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 2.64f)
                lineTo(12f, 0.01f)
                lineTo(4.05f, 2.64f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.48f)
                verticalLineTo(12f)
                curveToRelative(0f, 7.52f, 9.2f, 11.68f, 9.59f, 11.85f)
                lineToRelative(0.35f, 0.16f)
                lineToRelative(0.37f, -0.12f)
                curveTo(12.71f, 23.75f, 22f, 20.58f, 22f, 12f)
                verticalLineTo(5.48f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.95f, 2.64f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 6.26f, -6.35f, 9.22f, -7.95f, 9.86f)
                curveTo(10.44f, 21.06f, 4f, 17.49f, 4f, 12f)
                verticalLineTo(5.48f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, -0.94f)
                lineTo(12f, 2.11f)
                lineToRelative(7.32f, 2.43f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, -3f)
                close()
            }
        }.also { _ShieldPlus = it}
