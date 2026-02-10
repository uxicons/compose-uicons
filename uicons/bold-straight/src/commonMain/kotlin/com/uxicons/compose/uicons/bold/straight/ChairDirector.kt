package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairDirector: ImageVector? = null

val Icons.Bs.ChairDirector: ImageVector
    get() = _ChairDirector ?: UXIcon(name = "ChairDirector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 14.39f)
                lineToRelative(8.87f, 4.84f)
                lineTo(0.12f, 24f)
                lineTo(6.38f, 24f)
                lineToRelative(5.62f, -3.06f)
                lineToRelative(5.62f, 3.06f)
                horizontalLineToRelative(6.26f)
                lineToRelative(-8.75f, -4.77f)
                lineToRelative(8.87f, -4.84f)
                lineTo(24f, 0f)
                close()
                moveTo(21f, 8f)
                verticalLineToRelative(2.89f)
                curveToRelative(-1.5f, 0.41f, -4.68f, 1.11f, -9f, 1.11f)
                reflectiveCurveToRelative(-7.5f, -0.69f, -9f, -1.11f)
                verticalLineToRelative(-2.89f)
                lineTo(21f, 8f)
                close()
                moveTo(12f, 17.52f)
                lineToRelative(-5.21f, -2.84f)
                curveToRelative(1.49f, 0.19f, 3.24f, 0.32f, 5.21f, 0.32f)
                reflectiveCurveToRelative(3.71f, -0.13f, 5.21f, -0.32f)
                lineToRelative(-5.21f, 2.84f)
                close()
            }
        }.also { _ChairDirector = it}
