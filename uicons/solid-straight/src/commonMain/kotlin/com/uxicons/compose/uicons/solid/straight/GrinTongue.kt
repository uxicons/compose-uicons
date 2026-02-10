package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongue: ImageVector? = null

val Icons.Ss.GrinTongue: ImageVector
    get() = _GrinTongue ?: UXIcon(name = "GrinTongue") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(233.84f, 362.67f)
                horizontalLineToRelative(42.67f)
                verticalLineToRelative(12.8f)
                curveToRelative(-1.32f, 39.23f, -41.34f, 39.19f, -42.67f, 0f)
                verticalLineTo(362.67f)
                close()
                moveTo(511.17f, 256f)
                curveToRelative(-0.15f, 141.32f, -114.68f, 255.85f, -256f, 256f)
                curveToRelative(-339.2f, -12.8f, -339.05f, -499.2f, 0f, -512f)
                curveTo(396.49f, 0.15f, 511.02f, 114.68f, 511.17f, 256f)
                close()
                moveTo(148.51f, 224f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                reflectiveCurveTo(148.51f, 206.33f, 148.51f, 224f)
                close()
                moveTo(361.84f, 320f)
                horizontalLineTo(148.51f)
                verticalLineToRelative(42.67f)
                horizontalLineToRelative(42.67f)
                verticalLineToRelative(12.8f)
                curveToRelative(2.84f, 95.89f, 125.21f, 95.79f, 128f, 0f)
                verticalLineToRelative(-12.8f)
                horizontalLineToRelative(42.67f)
                verticalLineTo(320f)
                close()
                moveTo(361.84f, 224f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                curveTo(347.51f, 256f, 361.84f, 241.67f, 361.84f, 224f)
                close()
            }
        }.also { _GrinTongue = it}
