package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairDirector: ImageVector? = null

val Icons.Ts.ChairDirector: ImageVector
    get() = _ChairDirector ?: UXIcon(name = "ChairDirector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1f)
                horizontalLineTo(1f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(13.31f)
                lineToRelative(10.9f, 5.56f)
                lineTo(0.84f, 24f)
                horizontalLineTo(3.04f)
                lineToRelative(8.96f, -4.57f)
                lineToRelative(8.96f, 4.57f)
                horizontalLineToRelative(2.2f)
                lineToRelative(-10.06f, -5.13f)
                lineToRelative(10.9f, -5.56f)
                verticalLineTo(0f)
                close()
                moveTo(1f, 9f)
                horizontalLineTo(23f)
                verticalLineToRelative(3.5f)
                curveToRelative(-1.11f, 0.36f, -5.12f, 1.5f, -11f, 1.5f)
                reflectiveCurveToRelative(-9.88f, -1.14f, -11f, -1.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(23f, 2f)
                verticalLineToRelative(6f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                horizontalLineTo(23f)
                close()
                moveTo(4.16f, 14.3f)
                curveToRelative(1.96f, 0.37f, 4.62f, 0.7f, 7.84f, 0.7f)
                reflectiveCurveToRelative(5.88f, -0.33f, 7.84f, -0.7f)
                lineToRelative(-7.84f, 4.0f)
                lineToRelative(-7.84f, -4.0f)
                close()
            }
        }.also { _ChairDirector = it}
