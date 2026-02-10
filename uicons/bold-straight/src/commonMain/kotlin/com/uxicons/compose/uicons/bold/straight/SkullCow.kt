package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCow: ImageVector? = null

val Icons.Bs.SkullCow: ImageVector
    get() = _SkullCow ?: UXIcon(name = "SkullCow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.65f, 4.96f)
                lineToRelative(2.08f, 5.52f)
                curveToRelative(0.76f, 2.17f, -0.2f, 4.54f, -2.22f, 5.55f)
                lineToRelative(-1.72f, 0.61f)
                lineToRelative(-1.58f, 7.36f)
                lineTo(7.79f, 24.0f)
                lineToRelative(-1.58f, -7.36f)
                lineToRelative(-1.72f, -0.61f)
                curveToRelative(-2.02f, -1.01f, -2.98f, -3.38f, -2.23f, -5.51f)
                lineToRelative(2.09f, -5.55f)
                curveTo(1.9f, 4.64f, 0f, 2.54f, 0f, 0f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 2.54f, -1.9f, 4.64f, -4.35f, 4.96f)
                close()
                moveTo(18.91f, 11.5f)
                lineToRelative(-2.45f, -6.5f)
                lineTo(7.54f, 5.0f)
                lineToRelative(-2.46f, 6.54f)
                curveToRelative(-0.23f, 0.65f, 0.06f, 1.41f, 0.69f, 1.77f)
                lineToRelative(3.03f, 1.06f)
                lineToRelative(1.42f, 6.64f)
                horizontalLineToRelative(3.58f)
                lineToRelative(1.42f, -6.64f)
                lineToRelative(3.03f, -1.06f)
                curveToRelative(0.62f, -0.35f, 0.92f, -1.11f, 0.68f, -1.8f)
                close()
            }
        }.also { _SkullCow = it}
