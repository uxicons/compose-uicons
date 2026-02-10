package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertAlt: ImageVector? = null

val Icons.Ss.InsertAlt: ImageVector
    get() = _InsertAlt ?: UXIcon(name = "InsertAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-15.04f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-4.24f, -4.24f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.24f, 3.24f)
                horizontalLineToRelative(15.04f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(4.47f, 0f, 8.26f, 2.95f, 9.54f, 7f)
                horizontalLineToRelative(2.07f)
                curveTo(22.27f, 3.83f, 17.58f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(5.58f, 0f, 10.27f, -3.83f, 11.61f, -9f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-1.28f, 4.05f, -5.07f, 7f, -9.54f, 7f)
                close()
            }
        }.also { _InsertAlt = it}
