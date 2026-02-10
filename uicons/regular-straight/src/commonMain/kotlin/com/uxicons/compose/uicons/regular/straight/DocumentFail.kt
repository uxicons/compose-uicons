package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentFail: ImageVector? = null

val Icons.Rs.DocumentFail: ImageVector
    get() = _DocumentFail ?: UXIcon(name = "DocumentFail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-14.91f)
                lineToRelative(-5.09f, -5.09f)
                close()
                moveTo(11f, 4.91f)
                lineTo(13.09f, 7f)
                horizontalLineToRelative(-2.09f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.74f, 2.74f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-3.3f, 3.29f)
                lineToRelative(-2.66f, -2.66f)
                verticalLineToRelative(-7.35f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 20f)
                verticalLineToRelative(-4.82f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(3.3f, -3.29f)
                lineToRelative(3.3f, 3.29f)
                lineToRelative(2.74f, -2.74f)
                verticalLineToRelative(4.89f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(21f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12.41f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-12.41f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 17.59f)
                lineTo(21f, 18.59f)
                lineTo(20f, 17.59f)
                verticalLineToRelative(-11.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DocumentFail = it}
