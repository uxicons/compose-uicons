package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextHeight: ImageVector? = null

val Icons.Rs.TextHeight: ImageVector
    get() = _TextHeight ?: UXIcon(name = "TextHeight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(12f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(10f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                lineTo(0f, 5f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(20f, 20.96f)
                lineTo(20f, 10.05f)
                lineToRelative(2.2f, 2.2f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.26f, -3.26f)
                curveToRelative(-0.78f, -0.78f, -2.04f, -0.78f, -2.81f, 0f)
                lineToRelative(-3.26f, 3.26f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.29f, -2.3f)
                verticalLineToRelative(11.09f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.26f, 3.26f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(3.26f, -3.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.2f, 2.21f)
                close()
            }
        }.also { _TextHeight = it}
