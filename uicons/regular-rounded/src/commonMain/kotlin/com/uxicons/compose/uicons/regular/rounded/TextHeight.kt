package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextHeight: ImageVector? = null

val Icons.Rr.TextHeight: ImageVector
    get() = _TextHeight ?: UXIcon(name = "TextHeight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(12f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(10f, 2f)
                lineTo(5f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(21.75f, 19.25f)
                lineToRelative(-1.75f, 1.75f)
                lineTo(20f, 12f)
                lineToRelative(1.75f, 1.75f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.75f, -2.75f)
                curveToRelative(-0.39f, -0.39f, -0.89f, -0.58f, -1.4f, -0.58f)
                curveToRelative(0f, 0f, 0f, 0f, -0.01f, 0f)
                reflectiveCurveToRelative(0f, 0f, -0.01f, 0f)
                curveToRelative(-0.51f, 0f, -1.01f, 0.2f, -1.4f, 0.58f)
                lineToRelative(-2.75f, 2.75f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.75f, -1.75f)
                verticalLineToRelative(9f)
                lineToRelative(-1.75f, -1.75f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.4f, 0.58f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.51f, 0f, 1.02f, -0.2f, 1.4f, -0.58f)
                lineToRelative(2.75f, -2.75f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                close()
            }
        }.also { _TextHeight = it}
