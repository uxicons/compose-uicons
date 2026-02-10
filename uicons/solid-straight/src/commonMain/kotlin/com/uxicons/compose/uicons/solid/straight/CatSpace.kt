package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CatSpace: ImageVector? = null

val Icons.Ss.CatSpace: ImageVector
    get() = _CatSpace ?: UXIcon(name = "CatSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveTo(20.86f, 0f, 17f, 0f)
                close()
                moveTo(21f, 7f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                lineTo(13f, 3f)
                lineToRelative(2.03f, 1.52f)
                curveToRelative(0.58f, -0.33f, 1.25f, -0.52f, 1.97f, -0.52f)
                reflectiveCurveToRelative(1.39f, 0.19f, 1.97f, 0.52f)
                lineToRelative(2.03f, -1.52f)
                verticalLineToRelative(4f)
                close()
                moveTo(4.5f, 2.5f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                lineTo(6.56f, 24f)
                curveToRelative(-3.22f, 0f, -6.56f, -2.06f, -6.56f, -5.5f)
                curveToRelative(0f, -2.13f, 0.94f, -3.66f, 1.78f, -5.0f)
                curveToRelative(0.66f, -1.06f, 1.22f, -1.97f, 1.22f, -3.0f)
                curveToRelative(0f, -1.3f, -0.36f, -2.5f, -3f, -2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(4.35f, 0f, 5f, 2.82f, 5f, 4.5f)
                curveToRelative(0f, 1.6f, -0.77f, 2.84f, -1.52f, 4.05f)
                curveToRelative(-0.76f, 1.23f, -1.48f, 2.38f, -1.48f, 3.95f)
                curveToRelative(0f, 1.79f, 1.47f, 2.85f, 3.0f, 3.28f)
                curveToRelative(0.01f, -1.13f, 0.28f, -6.36f, 4.55f, -9.73f)
                curveToRelative(1.62f, 2.38f, 4.35f, 3.95f, 7.45f, 3.95f)
                curveToRelative(1.85f, 0f, 3.57f, -0.56f, 5f, -1.52f)
                verticalLineToRelative(7.52f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _CatSpace = it}
