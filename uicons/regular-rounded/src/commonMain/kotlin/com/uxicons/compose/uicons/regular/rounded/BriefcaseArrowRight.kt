package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseArrowRight: ImageVector? = null

val Icons.Rr.BriefcaseArrowRight: ImageVector
    get() = _BriefcaseArrowRight ?: UXIcon(name = "BriefcaseArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-1.1f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 9f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(-7.66f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(10f)
                close()
                moveTo(17.15f, 11.9f)
                curveToRelative(0.54f, 0.54f, 0.85f, 1.3f, 0.85f, 2.1f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(-2.39f, 2.56f)
                curveToRelative(-0.2f, 0.21f, -0.46f, 0.32f, -0.73f, 0.32f)
                curveToRelative(-0.24f, 0f, -0.49f, -0.09f, -0.68f, -0.27f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                lineToRelative(2.16f, -2.32f)
                lineTo(7f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(15.43f, 13f)
                lineToRelative(-2.16f, -2.32f)
                curveToRelative(-0.38f, -0.4f, -0.35f, -1.04f, 0.05f, -1.41f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                lineToRelative(2.41f, 2.59f)
                close()
            }
        }.also { _BriefcaseArrowRight = it}
