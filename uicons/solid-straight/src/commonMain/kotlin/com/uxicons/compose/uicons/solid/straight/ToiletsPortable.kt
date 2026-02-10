package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletsPortable: ImageVector? = null

val Icons.Ss.ToiletsPortable: ImageVector
    get() = _ToiletsPortable ?: UXIcon(name = "ToiletsPortable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1.99f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(-11f)
                lineTo(13f, 1.99f)
                lineToRelative(0.41f, -0.3f)
                curveToRelative(0.09f, -0.07f, 2.34f, -1.69f, 5.09f, -1.69f)
                reflectiveCurveToRelative(5.0f, 1.62f, 5.09f, 1.69f)
                lineToRelative(0.41f, 0.3f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(18f)
                close()
                moveTo(5.5f, 0f)
                curveTo(2.75f, 0f, 0.5f, 1.62f, 0.41f, 1.69f)
                lineToRelative(-0.41f, 0.3f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(11f)
                lineTo(11f, 1.99f)
                lineToRelative(-0.41f, -0.3f)
                curveToRelative(-0.09f, -0.07f, -2.34f, -1.69f, -5.09f, -1.69f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                lineTo(0f, 6f)
                verticalLineToRelative(18f)
                close()
            }
        }.also { _ToiletsPortable = it}
