package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonToDoor: ImageVector? = null

val Icons.Ss.PersonToDoor: ImageVector
    get() = _PersonToDoor ?: UXIcon(name = "PersonToDoor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3.83f, 16.8f)
                lineToRelative(-0.49f, 1.2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.67f)
                lineToRelative(0.8f, -1.94f)
                lineToRelative(-0.67f, -0.42f)
                curveToRelative(-0.37f, -0.24f, -0.69f, -0.53f, -0.98f, -0.84f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1.79f)
                lineToRelative(-2.14f, -3.55f)
                curveToRelative(-0.54f, -0.9f, -1.52f, -1.45f, -2.57f, -1.45f)
                horizontalLineTo(2.38f)
                lineTo(0.1f, 10.55f)
                lineToRelative(1.79f, 0.9f)
                lineToRelative(1.72f, -3.45f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-1.75f, 4.27f)
                curveToRelative(-0.55f, 1.35f, -0.06f, 2.9f, 1.17f, 3.67f)
                lineToRelative(4.12f, 2.6f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.55f)
                lineToRelative(-3.33f, -2.11f)
                lineToRelative(2.4f, -5.68f)
                lineToRelative(2.01f, 3.34f)
                horizontalLineToRelative(4.92f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(8f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonToDoor = it}
