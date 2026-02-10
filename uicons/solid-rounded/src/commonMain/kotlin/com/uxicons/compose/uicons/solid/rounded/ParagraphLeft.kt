package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParagraphLeft: ImageVector? = null

val Icons.Sr.ParagraphLeft: ImageVector
    get() = _ParagraphLeft ?: UXIcon(name = "ParagraphLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(15f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(19f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-11f)
                curveTo(5.69f, 0f, 3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(23f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3.65f, 20f)
                lineToRelative(2.17f, 2.32f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                curveToRelative(-0.19f, 0.18f, -0.44f, 0.27f, -0.68f, 0.27f)
                curveToRelative(-0.27f, 0f, -0.53f, -0.11f, -0.73f, -0.32f)
                lineToRelative(-2.41f, -2.59f)
                curveToRelative(-1.15f, -1.15f, -1.15f, -3.05f, 0.02f, -4.22f)
                lineToRelative(2.39f, -2.56f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.05f)
                curveToRelative(0.4f, 0.38f, 0.42f, 1.01f, 0.05f, 1.41f)
                lineToRelative(-2.16f, 2.32f)
                horizontalLineToRelative(18.35f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ParagraphLeft = it}
