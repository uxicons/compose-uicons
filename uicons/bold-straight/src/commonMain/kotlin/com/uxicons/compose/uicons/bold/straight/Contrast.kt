package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Contrast: ImageVector? = null

val Icons.Bs.Contrast: ImageVector
    get() = _Contrast ?: UXIcon(name = "Contrast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(21f, 10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3f, 10.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(2.45f, 19.43f)
                lineTo(4.58f, 21.55f)
                lineTo(6.7f, 19.43f)
                lineTo(4.58f, 17.3f)
                close()
                moveTo(21.55f, 4.58f)
                lineTo(19.43f, 2.45f)
                lineTo(17.3f, 4.58f)
                lineTo(19.43f, 6.7f)
                close()
                moveTo(17.3f, 19.43f)
                lineTo(19.43f, 21.55f)
                lineTo(21.55f, 19.43f)
                lineTo(19.43f, 17.3f)
                close()
                moveTo(6.7f, 4.58f)
                lineTo(4.58f, 2.45f)
                lineTo(2.45f, 4.58f)
                lineTo(4.58f, 6.7f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _Contrast = it}
