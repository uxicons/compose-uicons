package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairDirector: ImageVector? = null

val Icons.Rr.ChairDirector: ImageVector
    get() = _ChairDirector ?: UXIcon(name = "ChairDirector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(0f, 0.45f, 0f, 1f)
                verticalLineTo(10.53f)
                curveToRelative(0.01f, 1.89f, 1.06f, 3.62f, 2.76f, 4.47f)
                lineToRelative(7f, 3.5f)
                lineToRelative(-7.21f, 3.6f)
                curveToRelative(-0.49f, 0.25f, -0.69f, 0.85f, -0.45f, 1.34f)
                curveToRelative(0.25f, 0.5f, 0.86f, 0.69f, 1.34f, 0.45f)
                lineToRelative(8.55f, -4.28f)
                lineToRelative(8.55f, 4.28f)
                curveToRelative(0.48f, 0.24f, 1.09f, 0.05f, 1.34f, -0.45f)
                curveToRelative(0.25f, -0.49f, 0.05f, -1.09f, -0.45f, -1.34f)
                lineToRelative(-7.21f, -3.6f)
                lineToRelative(7f, -3.5f)
                curveToRelative(1.7f, -0.85f, 2.75f, -2.58f, 2.76f, -4.47f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(2.24f, 11.69f)
                curveToRelative(-0.15f, -0.36f, -0.24f, -0.75f, -0.24f, -1.16f)
                verticalLineToRelative(-1.53f)
                horizontalLineTo(22f)
                verticalLineToRelative(1.53f)
                curveToRelative(0f, 0.41f, -0.08f, 0.8f, -0.24f, 1.16f)
                curveToRelative(-1.12f, 0.35f, -4.66f, 1.31f, -9.76f, 1.31f)
                reflectiveCurveToRelative(-8.64f, -0.96f, -9.76f, -1.31f)
                close()
                moveTo(22f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                close()
                moveTo(6.51f, 14.64f)
                curveToRelative(1.54f, 0.21f, 3.39f, 0.36f, 5.49f, 0.36f)
                reflectiveCurveToRelative(3.94f, -0.15f, 5.49f, -0.36f)
                lineToRelative(-5.49f, 2.74f)
                lineToRelative(-5.49f, -2.74f)
                close()
            }
        }.also { _ChairDirector = it}
