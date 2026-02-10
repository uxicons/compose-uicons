package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Rr.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 13f)
                curveToRelative(0.88f, 0f, 1.7f, 0.25f, 2.39f, 0.69f)
                lineToRelative(-6.2f, 6.2f)
                curveToRelative(-0.44f, -0.69f, -0.69f, -1.51f, -0.69f, -2.39f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(17.5f, 22f)
                curveToRelative(-0.88f, 0f, -1.7f, -0.25f, -2.39f, -0.69f)
                lineToRelative(6.2f, -6.2f)
                curveToRelative(0.44f, 0.69f, 0.69f, 1.51f, 0.69f, 2.39f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(2f, 13f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.72f, 0f, 1.41f, -0.17f, 2.04f, -0.49f)
                curveToRelative(0.49f, -0.25f, 1.09f, -0.06f, 1.35f, 0.44f)
                curveToRelative(0.25f, 0.49f, 0.06f, 1.09f, -0.43f, 1.35f)
                curveToRelative(-0.91f, 0.46f, -1.93f, 0.71f, -2.96f, 0.71f)
                curveTo(2.92f, 24f, 0f, 21.08f, 0f, 17.5f)
                lineTo(0f, 6.5f)
                curveTo(0f, 2.92f, 2.92f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(2f, 4.02f, 2f, 6.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(2f, 13f)
                close()
            }
        }.also { _Pills = it}
