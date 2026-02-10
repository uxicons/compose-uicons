package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertAlt: ImageVector? = null

val Icons.Bs.InsertAlt: ImageVector
    get() = _InsertAlt ?: UXIcon(name = "InsertAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-13.33f)
                lineToRelative(2.39f, 2.39f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-4.24f, -4.24f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0f, -3.54f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.39f, 2.39f)
                horizontalLineToRelative(13.33f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                curveToRelative(3.52f, 0f, 6.57f, 2.04f, 8.05f, 5f)
                horizontalLineToRelative(3.25f)
                curveTo(21.65f, 3.35f, 17.21f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(5.21f, 0f, 9.65f, -3.35f, 11.3f, -8f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-1.48f, 2.96f, -4.53f, 5f, -8.05f, 5f)
                close()
            }
        }.also { _InsertAlt = it}
