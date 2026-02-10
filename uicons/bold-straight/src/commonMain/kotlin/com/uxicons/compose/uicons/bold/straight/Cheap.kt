package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheap: ImageVector? = null

val Icons.Bs.Cheap: ImageVector
    get() = _Cheap ?: UXIcon(name = "Cheap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.55f, 19.07f)
                lineToRelative(-4.29f, 4.21f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.75f, 0.72f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-4.25f, -4.25f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.4f, 2.4f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(19.33f)
                lineToRelative(2.45f, -2.4f)
                lineToRelative(2.1f, 2.14f)
                close()
                moveTo(5f, 10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                verticalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                close()
                moveTo(14f, 0.84f)
                curveToRelative(-1.23f, -0.54f, -2.58f, -0.84f, -4f, -0.84f)
                curveTo(4.49f, 0f, 0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                verticalLineToRelative(-3f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                curveToRelative(1.49f, 0f, 2.87f, 0.47f, 4f, 1.26f)
                verticalLineTo(0.84f)
                close()
            }
        }.also { _Cheap = it}
